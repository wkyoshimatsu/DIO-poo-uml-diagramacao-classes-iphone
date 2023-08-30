public class AparelhoTelefonico() extends Iphone{
    public Ligacao ligacaoAtual;
    public List<Ligacao> ligacoesEmEspera;
    private List<Contato> contatos;

    private boolean ligar(Contato contato){
        Ligacao novaLigacao = new Ligacao(contato);
        return novaLigacao.estaConectado;
    }

    public atender(Ligacao ligacao){
        ReprodutorMusical.pausar();
        this.ligacaoAtual = ligacao;
        (super) setSaidaAudio = ligacao;
    }

    private void iniciarCorreioVoz(CorreioDeVoz correioDeVoz){
        (super) setSaidaAudio = correioDeVoz;
    }

}