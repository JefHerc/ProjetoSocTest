# language: pt
# encoding: utf-8

Funcionalidade: Busca no blog

  Esquema do Cenario: Pesquisa no blog que encontra resultados
    Dado que estou na tela do principal do blog
    Quando digito no campo de procura a "<pesquisa>" no blog
    E pressiono enter
    Então os resultados exibidos relacionados a pesquisa são exibidos na tela

    Exemplos: 
      | pesquisa   |
      | Unimed     |
      | conta azul |

  Esquema do Cenario: Pesquisa no blog de assuntos inexistentes
    Dado que estou na tela do principal do blog
    Quando digito no campo de procura a "<pesquisa>" no blog
    E pressiono enter
    Então a mensagem "Nenhum resultado encontrado" é exibida na tela

    Exemplos: 
      | pesquisa  |
      | Guatemala |
      | Phyton    |
