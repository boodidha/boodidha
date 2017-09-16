import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 *
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation
{

	private Student[] students;

	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents()
	 {
	     int i;
	     for(i=0;i<=students.length;i++)
         {
		if(students[i]==null)
        {
		try
		{
            throw new  IllegalArgumentException();
		}
		catch(IllegalArgumentException e)
		{
		  System.out.println("exception raised") ;
		}
        }
        else
        {
		return students;
        }
	 }
	}
	@Override
	public void setStudents(Student[] students)

	{
	    int i;
	    for(i=0;i<=students.length;i++)
	    {
            if(i<0 && i>students.length)
            {
            try
		{
            throw new  IllegalArgumentException();
		}
		catch(IllegalArgumentException e)
		{
		  System.out.println("exception raised") ;
		}
        }
		// Add your implementation here
	}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index)
	{

	    if(students==null)
        {
		try
		{
            throw new  IllegalArgumentException();
		}
		catch(IllegalArgumentException e)
		{
		  System.out.println("exception raised") ;
		}
        }

		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort()
	 {
	     int i,j;
	 //    student[];
	     for(i=0;i<=students.length;i++)
         {
             if(students[i]==null)
             {
                 try
		{
            throw new  IllegalArgumentException();
		}
		catch(IllegalArgumentException e)
		{
		  System.out.println("exception raised") ;
		}
             }
		for(j=i;j<=students.length;j++)
        {
            if(students[i].birthDate>students[j].birthDate)
            {
                Student ss=students[i];
                sudents[i]=students[j];
                students[j]=ss;

            }
        }
        }
    System.out.println("data is sorted as \n name \t ate of birth");
    for(i=0;i<=students.length;i++)
    System.out.println(" \n "+students[i].fullName+"\t"+students[i].birthDate);
             }
	@Override
	public Student[] getByBirthDate(Date date)
	 {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
