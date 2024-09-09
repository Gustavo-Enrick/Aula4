public class Esfera {
    private float raio;

    public Esfera(float raio){
        this.raio = raio;
    }


    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float calcularVolume(){
        double volume = ((double) 4 /3) * Math.PI * Math.pow(this.raio,3);
        return (float) volume;
    }

    public float calcularArea(){
        double area = 4 * Math.PI * Math.pow(this.raio,2);
        return (float) area;
    }
}
