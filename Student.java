
public class Student {

	String index;
	String firstName;
	String lastName;
	static int labPoints[] = {2,6,9,10,15};
	//TODO constructor
	public Student(String index, String name, String lName){

        this.index=index;
        this.firstName=name;
        this.lastName=lName;
}
    public void setName(String name){
    	this.firstName=name;
}
    public void setlName(String lname){
    	this.lastName=lname;
}
    public String getName(){
    	return this.firstName;
}
    public String getlName(){
    	return this.lastName;
}
    public String getIndex(){
    	return this.index;
}


	//TODO seters & getters

	public double getAverage(int labPoints) {
		
		    int sum=0;
		    int brPoeni = this.labPoints.length;
		    for(int i=0;i<i++;){
		    sum+=this.labPoints[i];
		    }
		    return sum/brPoeni
		
		//TODO
	}

	public boolean hasSignature() {
		//TODO
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<Student.labPoints.length;i++)//length is the property of array  
			System.out.println(Student.labPoints[i]);  

	}
}


