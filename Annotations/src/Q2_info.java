import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Info
{
	int AuthorID();
	String Author();
	String Supervisor();
	String Date();
	String Time();
	int Version();
	String Description();
	
}

@Info(
		AuthorID=999,
		Author="Shivani",
		Supervisor="Shravani",
		Date="08-10-2021",
		Time="7:00",
		Version=9,
		Description="Excellent")

class Information{
	int AuthorID;
	String Author;
	String Supervisor;
	String Date;
	String Time;
	int Version;
	String Description;
	public Information(int AuthorID, String Author, String Supervisor, String Date, String Time, int Version,
			String Description) {
		
		this.AuthorID = AuthorID;
		this.Author = Author;
		this.Supervisor = Supervisor;
		this.Date = Date;
		this.Time = Time;
		this.Version = Version;
		this.Description = Description;
	}	
}

public class Q2_info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Information obj = new Information(0,null,null,null,null,0,null);
		Class c = obj.getClass();
		Annotation an = c.getAnnotation(Info.class);
		
		Info i = (Info)an;
		System.out.println(i.AuthorID());
		System.out.println(i.Author());
		System.out.println(i.Supervisor());
		System.out.println(i.Date());
		System.out.println(i.Time());
		System.out.println(i.Version());
		System.out.println(i.Description());
		

	}

}
