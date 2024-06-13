package celular;

import aparelhoTelefonico.AparelhoTelefonico;
import aparelhoTelefonico.Telefone;
import internet.NavegadorInternet;
import internet.Safira;
import reprodutorMusical.Ipod;
import reprodutorMusical.ReprodutorMusical;

public class Iphone{
	public static void main(String[] args) {
		ReprodutorMusical ipod = new Ipod();
		AparelhoTelefonico telefone = new Telefone();
		NavegadorInternet safira = new Safira();
	
		ipod.selecionarMusica("Hotel California");
		telefone.atender();
		safira.exibirPagina("www.dio.me");
	}
}
