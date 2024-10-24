package yagoaula;
import java.util.*;
public class Yagoaula {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int escolha;
        do{
            System.out.printf("/n-------------------------\n");
            System.out.printf("t/..menu de exemplos ..|\n");
            System.out.printf("tOpcao 1 : EXEMPLO DE NOTAS.\n");
            System.out.printf("tOpcao 2 : EXEMPLO DE REPETICAO.\n");
            System.out.printf("tOpcao 0 : SAIR DO SISTEMA.\n");
            escolha = ler.nextInt();
     
            switch(escolha){
                case 1:    notas();        break;
                case 2:    repeticao();    break;
                case 0:    sair();         break;
        
                default:    System.out.printf("OPCAO INVALIDA\n");
            }
        }while(escolha != 0 );  
        System.out.printf("\nOBRIGADO POR UTILIZAR NOSSO SISTEMA!\n");
    }

    public static void notas(){
        Scanner ler = new Scanner(System.in);
        float av1, av2, av3, media;
        
        System.out.printf("informe a nota da av1: ");
        av1 = ler.nextFloat();
        System.out.printf("informe a nota da av2: ");
        av2 = ler.nextFloat();
        System.out.printf("informe a nota da av3: ");
        av3 = ler.nextFloat();
        
        media = valor_Media(av1, av2, av3);
    }
    
    public static float valor_Media(float nota1, float nota2, float nota3){
        float valorMedia=0;
        if( nota1 < nota2 && nota1 < nota3 ){
            valorMedia = (nota2 + nota3) / 2;
        }else
            if(nota2 < nota1 && nota2 < nota3 ){
     }
       return valorMedia;
   }
}
   
