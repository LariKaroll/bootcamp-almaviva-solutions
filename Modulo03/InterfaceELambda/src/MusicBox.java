public record MusicBox() implements MusicPlayer{

    @Override
    public void playMusic() {
        System.out.println("A caixa de musica está tocando a music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("A caixa de musica está pausando a music");
    }

    @Override
    public void stopMusic() {
        System.out.println("A caixa de musica está parando a music");
    }
}
