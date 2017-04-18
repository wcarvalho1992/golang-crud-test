# language: pt

Funcionalidade: Cadastro de produtos
  Como um usuário do Golang CRUD
  Eu quero poder cadastrar novos produtos
  De modo que eu possa gerenciá-los por meio do sistema

  Contexto:
    Dado que estou na tela de cadastro de novo produto

  Cenário: Cadastro de produto bem sucedido
    Quando eu submeter o formulário preenchido com os dados válidos
    Então o produto deverá ser cadastrado com sucesso
    
  Cenário: Cadastro de produto com o campo Nome do Produto vazio
    Quando eu submeter o formulário com o campo Nome do Produto vazio
    Então eu devo ver a mensagem "Nome é obrigatório."

  Cenário: Cadastro de produto com o campo Preço vazio
    Quando eu submeter o formulário com o campo Preço vazio
    Então eu devo ver a mensagem "Preço é obrigatório."

  Cenário: Cadastro de produto com o campo Data de validade vazio
    Quando eu submeter o formulário com o campo Data de validade vazio
    Então eu devo ver a mensagem "Data de validade é obrigatório."

  Cenário: Cadastro de produto com o limite de caracteres do campo Nome do Produto excedido
    Quando eu submeter o formulário excedendo o limite de caracteres do campo Nome do Produto
    Então o produto não deverá ser cadastrado

  Cenário: Cadastro de produto com a data de validade anterior a presente data
    Quando eu submeter o formulário com a data de validade anterior a presente data
    Então o produto não deverá ser cadastrado

  Cenário: Cadastro de produto com o campo Preço preenchido no formato inválido
    Quando eu submeter o formulário com o campo Preço preenchido com um valor diferente do formato de moeda
    Então o valor deverá ser ajustado para o formato correto
