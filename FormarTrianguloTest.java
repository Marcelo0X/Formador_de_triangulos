import java.util.Scanner;

public class FormarTrianguloTest{

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
	exibirTriangulo();
    }
    public static void exibirTriangulo(){
	try{
	    System.out.print("Lado A ");
	    int ladoA = in.nextInt();
	    System.out.print("Lado B ");
	    int ladoB = in.nextInt();
	    System.out.print("Lado C ");
	    int ladoC = in.nextInt();
	    FormarTriangulo tri = new FormarTriangulo(ladoA, ladoB, ladoC);
	    tri.triangulo();
	}catch(Exception y){
	    System.out.println("Erro - "+y);
	    in.nextLine();
	}
    }

}
