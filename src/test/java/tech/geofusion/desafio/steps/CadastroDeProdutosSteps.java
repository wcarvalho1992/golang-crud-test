package tech.geofusion.desafio.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Ent�o;
import cucumber.api.java.pt.Quando;
import tech.geofusion.desafio.pages.CrudPage;
import tech.geofusion.desafio.support.Driver;

public class CadastroDeProdutosSteps {

    private static final String USER_NAME = "washington";
    private static final String BROWSER_NAME = "firefox";
    private WebDriver driver;
    private CrudPage crudPage;

    public CadastroDeProdutosSteps() {
        this.driver = Driver.getDriver(BROWSER_NAME);
        this.crudPage = new CrudPage(driver);
    }

    @Dado("^que estou na tela de cadastro de novo produto$")
    public void que_estou_na_tela_de_cadastro_de_novo_produto() throws Throwable {
        abrirTelaDeCadastro();
    }

    @Quando("^eu submeter o formul�rio com dados v�lidos$")
    public void eu_submeter_o_formul�rio_com_dados_v�lidos() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Ent�o("^eu devo visualizar o produto cadastrado na lista de produtos$")
    public void eu_devo_visualizar_o_produto_cadastrado_na_lista_de_produtos() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Quando("^eu submeter o formul�rio com o campo Nome do Produto vazio$")
    public void eu_submeter_o_formul�rio_com_o_campo_Nome_do_Produto_vazio() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Ent�o("^eu devo ver a mensagem \"([^\"]*)\"$")
    public void eu_devo_ver_a_mensagem(String arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Quando("^eu submeter o formul�rio com o campo Pre�o vazio$")
    public void eu_submeter_o_formul�rio_com_o_campo_Pre�o_vazio() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Quando("^eu submeter o formul�rio com o campo Data de validade vazio$")
    public void eu_submeter_o_formul�rio_com_o_campo_Data_de_validade_vazio() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Quando("^eu submeter o formul�rio excedendo o limite de caracteres do campo Nome do Produto$")
    public void eu_submeter_o_formul�rio_excedendo_o_limite_de_caracteres_do_campo_Nome_do_Produto() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Ent�o("^o produto n�o dever� ser cadastrado$")
    public void o_produto_n�o_dever�_ser_cadastrado() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Quando("^eu submeter o formul�rio com a data de validade anterior a presente data$")
    public void eu_submeter_o_formul�rio_com_a_data_de_validade_anterior_a_presente_data() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Quando("^eu submeter o formul�rio com o campo Pre�o preenchido com um valor diferente do formato de moeda$")
    public void eu_submeter_o_formul�rio_com_o_campo_Pre�o_preenchido_com_um_valor_diferente_do_formato_de_moeda()
            throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Ent�o("^o valor dever� ser ajustado para o formato correto$")
    public void o_valor_dever�_ser_ajustado_para_o_formato_correto() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    private void abrirTelaDeCadastro() {
        crudPage.load();
        crudPage.login(USER_NAME);
        crudPage.openProductRegistrationForm();
    }

}
