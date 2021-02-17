package com.rsc.srm.fs.basic;

public class Book implements Comparable<Book> {
	
	
	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}


	private String name;
	
	private String author;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + "]";
	}

	@Override
	public int compareTo(Book o) {
		//return this.name.compareTo(o.getName());
		return o.getName().compareTo(this.getName());
	}


//	public static void main(String[] args) {
//		Book bk = new Book();
//		bk.setAuthor("User A");
//		bk.setName("Some ons Auto biography"); //-1717720945
//
//		Book bk2 = new Book();
//		bk2.setAuthor("User A");
//		bk2.setName("Some ons Auto biographY"); //-1717720945
//		
//		System.out.println(bk.hashCode());
//		System.out.println(bk2.hashCode());
//	}
}
