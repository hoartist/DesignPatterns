 class Student {
     public int sno;
     public String name;

     public Student(int sno, String name) {
         this.name = name;
         this.sno = sno;
     }
//학번과 이름이 동일한 경우 true를 리턴
     public boolean equals(Object obj) {
         if (obj instanceof Student) {
             Student student = (Student) obj;
             return (sno == student.sno) && (name.equals(student.name));
         } else {
             return false;
         }
     }
     //학번과 이름이 같다면 동일한 값을 리턴
     public int hashcode(){
         return sno+name.hashCode();
     }
     }
