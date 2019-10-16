package class_01_member;

public class MemberApp21810 {
    public static void main(String[] args) {
        IPeopleQmx[] p = new IPeopleQmx[5];
        p[0] = new PeopleQmx("oygz", 18);
        p[1] = new StudentQmx("wf");
        p[2] = new StudentQmx("ww");
        p[3] = new StudentQmx("wwf",17);
        p[4] = new TeacherQmx("qmx",30);
        for (int i=0; i<p.length; i++){
            System.out.println(p[i].getCard());
        }
    }
}



