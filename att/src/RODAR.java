

public class RODAR {
    public static void main(String[] args) {


      //  Funcionario funcionario = new Funcionario();
// classe mão trenformando
      //  Funcionario Gerente = new gerente();

        // classe filha VAI GERA UM ERRO
      //  gerente Gerente_ = ( gerente)  new  Funcionario();

    // roda aplicação da mae e filhas
    classMae[] classes = new classMae[]{ new  classFilha1(), new classFilha2() , new classMae() };


      for (classMae classe : classes){
          classe.metodo1();
        }
        System.out.println("");

for (classMae classe : classes){
    classe.metodo2();
}
    
    }
    }




