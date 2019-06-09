public class NumereComplexe {
   public double parteIntreaga;
   public double parteImaginara;

    public NumereComplexe(double parteIntreaga, double parteImaginara) {
        this.parteIntreaga = parteIntreaga;
        this.parteImaginara = parteImaginara;
    }
        public String  toString()
        {
            return " Nr este: "+parteIntreaga+"+i*"+parteImaginara;
        }

        //returnam numar complex c2
        public NumereComplexe adunare(NumereComplexe c2)
        {

            //public NumereComplexe adunare(NumarComplex n){
        //double rez_parteintreaga;
        //double rez_parteimaginara;
        //rez_parteintreaga=parteintreaga +n.parteintreaga
        //rez_parteimaginara=parteimaginara+n.parteimaginara
        //return new NumereComplexe(rez_parteintreaga,rez_parteimaginara);
            return new NumereComplexe(parteIntreaga+c2.parteIntreaga,parteImaginara+c2.parteImaginara);

        }

        public NumereComplexe scadere(NumereComplexe c2)
        {

            return new NumereComplexe(parteIntreaga-c2.parteIntreaga,parteImaginara-c2.parteImaginara);
        }
        //daca partea imaginara este -, returneaza true, iar daca nu este 0 returneaza false
        public boolean isReal(){
        return parteImaginara==0;
        }
    }
