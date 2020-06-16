package Models;

public class Livro {
	
	private String title;
	private String author;
	private String gender;
	private int year;
	private boolean isRead;

	
	public Livro(String title, String author, String gender, int year, boolean isRead) {
		this.title = title;
		this.author = author;
		this.gender = gender;
		this.year = year;
		this.isRead = isRead;
	}
	
	public String toString() {
		return "Titulo: " + this.getTitle() + 
				" Autor: " + this.getAuthor() + 
				" Genero: " + this.getGender() + 
				" Ano: " + this.getYear() +
				"Lido: " + this.isIsRead();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isRead() {
		return isIsRead();
	}

	public void setRead(boolean isRead) {
            this.setIsRead(isRead);
	}

 
    public boolean isIsRead() {
        return isRead;
    }

   
    public void setIsRead(boolean isRead) {
        this.isRead = isRead;
    }

    public Object getGener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	
}
