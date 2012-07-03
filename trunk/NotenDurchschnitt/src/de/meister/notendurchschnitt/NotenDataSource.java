package de.meister.notendurchschnitt;

import java.util.ArrayList;
import java.util.List;
import de.meister.notendurchschnitt.MySQLiteHelper;
import de.meister.notendurchschnitt.Entry;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;


public class NotenDataSource {

	
	private SQLiteDatabase database;
	private MySQLiteHelper dbHelper;
	private String[] allColumns = { "ID", "NOTE"};
	
	
	
	public NotenDataSource(Context context) {
		dbHelper = new MySQLiteHelper(context);
	}
	
	public void open() throws SQLException {
		database = dbHelper.getWritableDatabase();
	}

	public void close() {
		dbHelper.close();
	}
	
	public Entry createEntry(int notec) {
		ContentValues values = new ContentValues();
		values.put("NOTE", notec);
		

		long insertId = database.insert("Noten", null,
				values);
		
		
		Cursor cursor = database.query("Noten",allColumns, "ID = " + insertId, null, null, null, null);
		cursor.moveToFirst();
	
		return cursorToEntry(cursor);
	}

	protected List<Entry> getAllEntries() {
		List<Entry> EntriesList = new ArrayList<Entry>();
		EntriesList = new ArrayList<Entry>();
		
		Cursor cursor = database.query("Noten", allColumns ,null, null, null, null, null);
		cursor.moveToFirst();
		
		if(cursor.getCount() == 0) return EntriesList;
		
		
		while (cursor.isAfterLast() == false) {
			Entry entry = cursorToEntry(cursor);
			EntriesList.add(entry);
			cursor.moveToNext();
		} 	

		cursor.close();
		
		return EntriesList;
	}
	

	private Entry cursorToEntry(Cursor cursor) {
		Entry entry = new Entry();
		entry.setId(cursor.getLong(0));
		entry.setNote(cursor.getInt(1));
		

		return entry;
	}
	
}
