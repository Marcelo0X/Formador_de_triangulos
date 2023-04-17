public class FormarTriangulo{

    private int ladoA;
    private int ladoB;
    private int ladoC;

    public FormarTriangulo(int ladoA, int ladoB, int ladoC){
	setLadoA(ladoA);
	setLadoB(ladoB);
	setLadoC(ladoC);
    }
    public void setLadoA(int ladoA){
	this.ladoA = ladoA;
    }
    public int getLadoA(){
	return ladoA;
    }
    public void setLadoB(int ladoB){
	this.ladoB = ladoB;
    }
    public int getLadoB(){
	return ladoB;
    }
    public void setLadoC(int ladoC){
	this.ladoC = ladoC;
    }
    public int getLadoC(){
	return ladoC;
    }
    public void triangulo(){
	if((ladoA < (ladoB + ladoC)) && (ladoB < (ladoA + ladoC)) && (ladoC < (ladoA + ladoB))){
	    System.out.println("Forma Triangulo");
	}else{
	    System.out.println("Não forma triangulo");
	}
    }

}
