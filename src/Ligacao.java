public class Ligacao extends Audio{
    public List<Contato> contato;
    public boolean estaConectado = false;

    public Ligacao(Contato contato) {
        contato = new ArrayList<Contato>();
        this.contato.add(contato);
        estaConectado = true;
    }
}