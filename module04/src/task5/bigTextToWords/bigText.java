package task5.bigTextToWords;

public class bigText {

    public static void main(String[] args){

        String text = "SHARKS HAVE ROAMED the world’s oceans for hundreds of millions of years. In that time, many species have barely changed. But some strange sharks are still evolving—and have even learned to walk. Meet the walking sharks.\n" +
                "\n" +
                "These three-foot-long creatures live near Australia, and, as their name implies, move their pectoral fins in the front and pelvic fins in the back to plod along the seafloor—or even atop coral reefs, outside the water, at low tide. Such mobility allows the sharks to wriggle between tide pools and different areas of the reef to prey upon crabs, shrimp, small fish—just about anything they can find.\n" +
                "\n" +
                "“During low tides, they became the top predator on the reef,” says Christine Dudgeon, a researcher at the University of Queensland in Brisbane, Australia.\n" +
                "\n" +
                "Now, a long-term study by an international group of collaborators has turned up four new species of walking sharks since 2008, bringing the total to nine walking shark species. In a paper published this week in the journal Marine and Freshwater Research, the researchers have also shown that these species all evolved in the last nine million years.\n" +
                "\n" +
                "That’s highly unusual, says Gavin Naylor, director of the Florida Program for Shark Research at the University of Florida, since most sharks evolve slowly. Sixgill sharks, for example, denizens of the deep sea, “seem stuck back in time,” Naylor says. “We see animals from 180 million years ago with exactly the same teeth.”\n" +
                "\n";


        int count = 0;
        for (String part : text.split(" ")) {
            count++;
            System.out.println("Cлово № " + count + " - " + part.replaceAll("[”“.,\\n]",""));
            }
    }
}
