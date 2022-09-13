/**
 *
 * @author roudet
 */
public class Ximenia {
    private double prix;
    private String origine;
	
    public Ximenia() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Ximenia(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Ximenia de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 Ximenias sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Ximenia or = (Ximenia) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une Ximenia a des pepins
        return false;
    }


    public static void main (String[] args){
        System.out.println("premier test Ximenia");
        Ximenia test = new Ximenia();
        test.setPrix(5);
        test.setOrigine("France");
        test.getPrix();
        test.getOrigine();
        System.out.println(test.toString());

        System.out.println("deuxieme test Ximenia");
        Ximenia test2 = new Ximenia();
        test2.setOrigine("");
        test2.setPrix(-1.5);
        System.out.println(test2.toString());

	
   }
}
