package view;

import model.Aplicativo;
import model.Arquivo;
import model.Aula;
import model.Mensagem;
import model.Pedido;
import model.Produto;
import model.Projeto;
import model.RedeSocial;
import model.Relatorio;
import model.Senha;
import model.SistemaOperacional;
import model.Site;
import model.Tarefa;
import model.Usuario;
import model.Avaliacao;
import model.BancoDados;
import model.Cliente;
import model.ContaBancaria;
import model.Curso;
import model.Jogo;

public class Main {
    public static void main(String[] args) {

		    Aplicativo Instagram = new Aplicativo();
        Instagram.nome = "Instagram";
        Instagram.instalarAplicativo();

        Aplicativo Facebook = new Aplicativo();
        Facebook.nome = "Facebook";
        Facebook.instalarAplicativo();

        Mensagem João = new Mensagem();
        João.nome = "João Pedro";
        João.enviarMensagem();

        Mensagem Caio = new Mensagem();
        Caio.nome = "Caio Edimar";
        Caio.enviarMensagem();

        Arquivo Geovanny = new Arquivo();
        Geovanny.nome = "Geovanny";
        Geovanny.editarArquivo();

        Arquivo Carlos = new Arquivo();
        Carlos.nome = "Carlos";
        Carlos.editarArquivo();

        Aula Alessandro = new Aula();
        Alessandro.nome = "Alessandro";
        Alessandro.passarConteudo();

        Aula Gilmar = new Aula();
        Gilmar.nome = "Gilmar";
        Gilmar.passarConteudo();

        Avaliacao Isaque = new Avaliacao();
        Isaque.nome = "Isaque";
        Isaque.preencherGabarito();

        Avaliacao Henrique = new Avaliacao();
        Henrique.nome = "Henrique";
        Henrique.preencherGabarito();

        BancoDados JoãoPedro = new BancoDados();
        JoãoPedro.nome = "João Pedro";
        JoãoPedro.inserirDados();

        BancoDados Eduardo = new BancoDados();
        Eduardo.nome = "Eduardo";
        Eduardo.inserirDados();

        Cliente Produto = new Cliente();
        Produto.nome = "Produto";
        Produto.avaliar();

        Cliente Atendimento = new Cliente();
        Atendimento.nome = "Atendimento";
        Atendimento.avaliar();

        ContaBancaria Valor1 = new ContaBancaria();
        Valor1.numero = 1000;
        Valor1.realizarTransferencia();

        ContaBancaria Valor2 = new ContaBancaria();
        Valor2.numero = 2500;
        Valor2.realizarTransferencia();

        Curso Codigo1 = new Curso();
        Codigo1.codigoMatricula = "GEOV2FPGDSM02-B";
        Codigo1.reabrirMatricula();

        Curso Codigo2 = new Curso();
        Codigo2.codigoMatricula = "RAFA2FPGBDG04-A";
        Codigo2.reabrirMatricula();

        Jogo nome = new Jogo();
        nome.nomeJogador = "Richard";
        nome.iniciarPartida();

        Jogo nome2 = new Jogo();
        nome2.nomeJogador = "Carlos Eduardo";
        nome2.iniciarPartida();

        Pedido item1 = new Pedido();
        item1.item = "X-BACON";
        item1.adicionarItem();

        Pedido item2 = new Pedido();
        item2.item = "DOLLY";
        item2.adicionarItem();

        Produto produto1 = new Produto();
        produto1.produto = "Teclado Gamer";
        produto1.removerProduto();

        Produto produto2 = new Produto();
        produto2.produto = "Mouse Gamer";
        produto2.removerProduto();

        Projeto projeto1 = new Projeto();
        projeto1.iniciarProjeto = "Projeto semestral";
        projeto1.iniciarTarefa();

        Projeto projeto2 = new Projeto();
        projeto2.iniciarProjeto = "Trabalho em grupo";
        projeto2.iniciarTarefa();

        RedeSocial nomeRede = new RedeSocial();
        nomeRede.perfilRede = "@geovanny.f.e";
        nomeRede.adicionarAmigo();

        RedeSocial nomeRede2 = new RedeSocial();
        nomeRede2.perfilRede = "@rich_e";
        nomeRede2.adicionarAmigo();

        Relatorio nomeArquivo = new Relatorio();
        nomeArquivo.autorExporta = "Relatorio_Empresa_28_08_25";
        nomeArquivo.autorExportou();

        Relatorio nomeArquivo2 = new Relatorio();
        nomeArquivo2.autorExporta = "Relatorio_Escolar_20_07_25";
        nomeArquivo2.autorExportou();

        Senha senha1 = new Senha();
        senha1.mudarSenha = "12 caracteres é 3 numeros";
        senha1.alterarSenha();

        Senha senha2 = new Senha();
        senha2.mudarSenha = "10 caracteres e 4 caracteres especiais";
        senha2.alterarSenha();

        SistemaOperacional limparMemoria = new SistemaOperacional();
        limparMemoria.memoria = 873;
        limparMemoria.liberarMemoria();

        SistemaOperacional limparMemoria2 = new SistemaOperacional();
        limparMemoria2.memoria = 1457;
        limparMemoria2.liberarMemoria();

        Site data1 = new Site();
        data1.dataPublicacao = "3 dia, na data 27/08/2025 as 17:13";
        data1.publicarConteudo();

        Site data2 = new Site();
        data2.dataPublicacao = "1 dia, na data 29/08/2025 as 14:51";
        data2.publicarConteudo();

        Tarefa editou1 = new Tarefa();
        editou1.tarefaEditada = 15;
        editou1.editarTarefa();

        Tarefa editou2 = new Tarefa();
        editou2.tarefaEditada = 48;
        editou2.editarTarefa();

        Usuario salvando1 = new Usuario();
        salvando1.salvandoUsuario = "O usuario: Geovanny2007?";
        salvando1.salvarUsuario();

        Usuario salvando2 = new Usuario();
        salvando2.salvandoUsuario = "O usuario: DeitaPombo123?";
        salvando2.salvarUsuario();


	}
}