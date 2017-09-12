
public class Part2
{
   public String  findSimpleGene(String dna, String startcodon, String stopcodon){

        
        int startIndex = dna.indexOf("ATG");

        int currIndex = dna.indexOf("TAA", startIndex + 3);

        while (currIndex != -1) {
            
            if((currIndex - startIndex) % 3 == 0) {
               return dna.substring(startIndex, currIndex +3);
            }
            else {
                  currIndex = dna.indexOf("TAA", currIndex + 1);
            }
        }
        
        return "";
    }
    
    public void testSimpleGene() {

        String dna = "AACGCGTAATTAATCG";
        System.out.println("DNA strand is " + dna);
        String gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene + "\n");

        dna = "CGATAGTTGATCAGCCTGAGCTATCA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene + "\n");
        
        dna = "CGATGGTTGATCAGCCTCAGCCATA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene + "\n");

        dna = "CGATGGTTGATAAGCCTAAGCTAAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene + "\n");
        
        dna = "CGATGGTTGATAAGCCGTAAGCTAAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene + "\n");
    }
}
