class grandparent{
    public String grandFathername,grandMothername;
    public grandparent(String a, String b){
        grandFathername=a;
        grandMothername=b;
        System.out.println("Grandfather's name: " + grandFathername +"      "+ "Grandmother's Name: " + grandMothername);
    }
}
class parent extends grandparent{
    public String fatherName,motherName;

    public parent(String a,String b,String c,String d){
        this(c,d);
        fatherName=a;
        motherName=b;
        System.out.println("Father's Name: " + fatherName +"        "+ "Mother's Name: " + motherName);
    }
    public  parent(String a,String b) {
        super(a,b);
        
    }
}

class child extends parent{

    child(String a,String b,String c,String d){
        super(a,b,c,d);
        
    }
    public static void main(String[] args) {
        child c1 = new child("Ashok","Ranjana","Somethin","Somethin2");
        
    }
}