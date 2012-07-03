package de.meister.notendurchschnitt;

public class Entry {
	private long id;
	private int note;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}
	@Override
	public String toString() {
	
	
	
	
	
	
		
	
	return String.format("(" + id + "." + ")        " + note );	
		
	}
}
