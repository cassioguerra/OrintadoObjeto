package visibilidade;

public class classe1 {
    public String atributo;
    // aparece em qualquer lugar
    private String atributo2;
    // so a parece na classe
    protected  String atributo3;
    // aparece nas classes e em sub classe


    public void meotodo1(){
// aparece em qualquer lugar
    }
    private void metodo2(){
        // so a parece na classe
    }
    protected void metodo3(){
        // aparece nas classes e em sub classe

    }
}

