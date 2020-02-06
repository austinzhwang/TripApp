import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main (String [] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Closet> suitCase = new ArrayList<>();
        String choice [] = {"work", "play", "vacation"};
        ArrayList<String> choiceList = new ArrayList<>();
        ArrayList<String> suitcaseList = new ArrayList<>();
        Collections.addAll(choiceList, choice);

        Closet workCloset, playCloset, vacationCloset;
        Jacket j;
        Shirt s;
        Pants p;
        Footwear f;

        String jacketColor, shirtMat, pantsType, fwType,  userChoice;

        for (int i = 0; i < 3; i++) {
            j = new Jacket();
            s = new Shirt();
            p = new Pants();
            f = new Footwear();
            System.out.print("Enter a suitcase to create " + choiceList + ": ");
            userChoice = in.nextLine();
            suitcaseList.add(userChoice);
            if (choiceList.contains(userChoice)) {
                choiceList.remove(userChoice);
            }
            System.out.print("Enter a jacket color: ");
            jacketColor = in.nextLine();
            j.setColor(jacketColor);
            System.out.print("Enter a shirt material: ");
            shirtMat = in.nextLine();
            s.setMaterial(shirtMat);
            System.out.print("Enter a pants type: ");
            pantsType = in.nextLine();
            p.setType(pantsType);
            System.out.print("Enter a footwear type: ");
            fwType = in.nextLine();
            f.setType(fwType);
            System.out.println();

            switch (userChoice) {
                case "work":
                    workCloset = new Closet(j, s, p, f);
                    suitCase.add(workCloset);
                    break;
                case "play":
                    playCloset = new Closet(j, s, p, f);
                    suitCase.add(playCloset);
                    break;
                case "vacation":
                    vacationCloset = new Closet(j, s, p, f);
                    suitCase.add(vacationCloset);
                    break;
            }
        }

        String miniCloset = "";
        int i = 0;
        for (Closet c : suitCase) {
            miniCloset += suitcaseList.get(i).substring(0, 1).toUpperCase()
                    + suitcaseList.get(i).substring(1) + " Suitcase:\n";
            miniCloset += "Jacket Color: " + c.getJ().getColor() + " | Shirt Material: " + c.getS().getMaterial()
                    + " | Pants Type: " + c.getP().getType() + " | Footwear Type: " + c.getF().getType() + "\n";
            i++;
        }
        System.out.println(miniCloset);

    }
}
