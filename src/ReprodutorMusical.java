public class ReprodutorMusical() extends Iphone{
    private Musica musicaAtual;
    private Musica musicaAnterior;
    private Musica musicaProxima;
    private List<Musica> musicas;

    public ReprodutorMusical(){

    }

    private void tocar(Musica musica){

    }

    public pausar(){

    }

    public Musica selecionarMusica(){
        return Musica
    }

    public Musica getMusicaAtual() {
        return musicaAtual;
    }

    public void setMusicaAtual(Musica musicaAtual) {
        this.musicaAtual = musicaAtual;
    }

    public Musica getMusicaAnterior() {
        return musicaAnterior;
    }

    public void setMusicaAnterior(Musica musicaAnterior) {
        this.musicaAnterior = musicaAnterior;
    }

    public Musica getMusicaProxima() {
        return musicaProxima;
    }

    public void setMusicaProxima(Musica musicaProxima) {
        this.musicaProxima = musicaProxima;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }
}