public class Main {
    public static void main(String[] args) {
        An info3 = new An("Informatica 3");
        Grupa g1 = new Grupa("Grupa 1");
        info3.add(g1);
        SemiGrupe s1 = new SemiGrupe("Semigrupa 1.1");
        info3.add(s1);
        Student st1 = new Student("Popescu I", "popescu@acme.edu");
        info3.add(st1);
        Student st2 = new Student("Ionescu", "ionescu@acme.edu");
        info3.add(st2);
        SemiGrupe s2 = new SemiGrupe("Semigrupa 1.2");
        info3.add(s2);
        Student st3 = new Student("Vasilescu I", "vasilescu@acme.edu");
        info3.add(st3);
        Student st4 = new Student("Georgescu E", "georgescu@acme.edu");
        info3.add(st4);
        info3.print();

    }

}



//  Problema : Studentii unei universitati sunt organizati in subgrupe 2 semigrupe formeaza o grupa si
//  mai multe grupe formeazaa un an de studiu . Student = nume si adresa iar gr. sgr. an au nume
//
// Output
//Informatica 3
//    Grupa 1
//        Semigrupa 1.1
//            Popescu I, popescu@acme.edu
//            Ionescu E, ionescu@acme.edu
//     Grupa 2
//             Semigrupa 1.2
//             Popescu I, popescu@acme.edu
//            Ionescu E, ionescu@acme.edu