import java.util.ArrayList;

public class WizardMain{

    public static void main(String[] args){
        Wizard w = new Wizard();
        System.out.println(w);

        HogwartsStudent s = new HogwartsStudent();
        System.out.println(s);

        HogwartsStudent ron = new HogwartsStudent("Ron Weasley", 12, "Gryffindoor");
        System.out.println(ron);

        w.expelliarmus();
        s.expelliarmus();


        ArrayList<Wizard> goldenTrio = new ArrayList<Wizard>();
        //HogwartsStudent -> Wizard
        goldenTrio.add(ron);
        goldenTrio.add(w);

        System.out.println(goldenTrio);

        //call expelliarmus on HogwartsStudent
        goldenTrio.get(0).expelliarmus();
        //call expelliarmus on WIzard
        goldenTrio.get(1).expelliarmus();


//             //THIS IS NOT ALLOWED
//         ArrayList<HogwartsStudent> students = new ArrayList<HogwartsStudent>();
//             //Cannot make a Wizard a HogwartsStudent
//         students.add(ron);
//         students.add(w);
        
//         System.out.println(students);
    }

}