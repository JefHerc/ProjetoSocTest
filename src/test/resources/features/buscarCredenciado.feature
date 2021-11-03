# language: pt
# encoding: utf-8

Funcionalidade: Busca de Credenciado

  Esquema do Cenario: Buscar credenciado existente
    Dado que estou na tela do blog
    E posiciono o cursor do mouse na guia Funcionalidades
    E seleciono a opcao RedeSOCNET
    E clico no botao Buscar credenciados
    E seleciono a opcao empresa
    E digito o nome da "<empresa>" dejada
    E clico em busca
    E posiciono o cursor do mouse na localizada
    Quando clico no botao Saiba Mais
    Então o perfil da "<empresa>" e exibido

    Exemplos: 
      | empresa                        |
      | SAÚDE OCUPACIONAL UNIMED - SOU |
      | 204 - SESI Unidade Caçador     |
