# SACI - Serviço de Aluguel e Compra de Imóveis

Este repositório contém o código-fonte e a documentação para o Serviço de Aluguel e Compra de Imóveis (SACI), uma aplicação que visa disponibilizar os imóveis disponíveis para aluguel e compra na cidade de Imperatriz-MA.

## Objetivos

Este projeto tem como objetivo oferecer uma plataforma onde clientes possam visualizar fotos, descrições e informações de contato para imóveis disponíveis na região.

## Escopo Geral do Produto

A aplicação fornecerá:

- Uma tela inicial (Home) apresentando todos os imóveis disponíveis.
- Uma área de administração para adicionar novas imagens, marcar imóveis como vendidos ou alugados, e gerenciar o conteúdo.
- Funcionalidade de login para administradores.

## Tecnologias Utilizadas

- **Linguagem de Programação:** Java SE 17
- **Framework:** Spring
- **Banco de Dados:** PostgreSql
- **Outras Tecnologias:** Html, Css, JavaScript, Bootstrap

## Arquitetura do Sistema

### Diagrama de caso de Uso
![UseCase Diagram](https://github.com/Bruno-FV/Saci/assets/60984829/431bfdad-b00a-4e15-8233-ba900218ad40)

### Diagrama de Clases
![Class Diagram](https://github.com/Bruno-FV/Saci/assets/60984829/073685fe-6707-4e16-8169-e4aa09c09c2a)

## Requisitos Funcionais

### RF:001 - Home
- UC:001
- **Prioridade: Alta**
- **Descrição:** O aplicativo, em sua tela inicial, apresentará todos os imóveis disponíveis para aluguel e compra, contendo todos os meios de contato do corretor.
- **Entrada:** Imagens do imóvel
- **Saída:** Contato do corretor
- **Pré-condição:** Aplicação funcionando
- **Pós-Condição:** Não se aplica
- **Stakeholder:** Usuários, administradores do sistema

### RF:002 - Administração
- UC:001
- **Prioridade: Alta**
- **Descrição:** Deverá disponibilizar a funcionalidade para inserir novas imagens de imóveis, opção para selecionar o imóvel como vendido ou alugado e não disponibilizar na página home os imóveis selecionados.
- **Entrada:** Acesso à página
- **Saída:** Atualização concluída
- **Pré-condição:** Ter efetuado o login
- **Pós-Condição:** Login efetuado com sucesso
- **Stakeholder:** Administradores do sistema

### RF:003 - Login
- UC:001
- **Prioridade: Alta**
- **Descrição:** Conter um cadastro do administrador para ter acesso à página de administração contendo Email e senha.
- **Entrada:** Informar dados do administrador
- **Saída:** Salvar dados do administrador
- **Pré-condição:** Não se aplica
- **Pós-Condição:** Não se aplica
- **Stakeholder:** Administradores do sistema

## Requisitos Não Funcionais

### RNF:001 - Codificação
- UC:
- **Prioridade: Alta**
- **Descrição:** A codificação deve atender a compatibilidade com os navegadores disponíveis no mercado, deve ter o layout responsivo para atender os diferentes tamanhos de telas dos dispositivos.
- **Entrada:** Não se aplica
- **Saída:** Não se aplica
- **Pré-condição:** Não se aplica
- **Pós-Condição:** Não se aplica
- **Stakeholder:** Usuários e administradores do sistema

### RNF:002 - Execução Simultânea
- UC:
- **Prioridade: Média**
- **Descrição:** Verificar a usabilidade do sistema em execução com diversos usuários.
- **Entrada:** Não se aplica
- **Saída:** Não se aplica
- **Pré-condição:** Realizado o login
- **Pós-Condição:** Login realizado com sucesso
- **Stakeholder:** Usuários, administradores do sistema

## Instruções de Instalação e Execução

[Incluir aqui instruções detalhadas sobre como instalar e executar o sistema.]

## Validação de Requisitos

[Incluir aqui informações sobre como os requisitos serão validados, como testes específicos, revisões por parte da equipe, entre outros.]

## Controle de Versão do Documento

Histórico de Revisões:

| Data       | Versão | Descrição                   | Responsável            |
|------------|--------|-----------------------------|------------------------|
| 18/11/2023 | 0.1    | Levantamento dos requisitos | Bruno Ferreira Vieira |
| 18/11/2023 | 0.2    | Especificação dos requisitos | Bruno Ferreira Vieira |
| 18/11/2023 | 0.3    | Inclusão das prioridades do sistema | Bruno Ferreira Vieira |
| 18/11/2023 | 0.4    | Inclusão dos requisitos funcionais | Bruno Ferreira Vieira |
| 18/11/2023 | 0.5    | Inclusão dos requisitos não funcionais | Bruno Ferreira Vieira |
| 18/11/2023 | 1.0    | Declaração do escopo não contemplado | Bruno Ferreira Vieira |
| 18/11/2023 | 1.1    | Finalização do documento de requisito | Bruno Ferreira Vieira |

## Escopo Não Contemplado

Não será desenvolvido no momento neste sistema:

- Uma área específica para usuários.

## Aprovação

_______________________  
Bruno Ferreira Vieira  
Gerente de projeto

_______________________  
Antônia Hildegarda Borges Oliveira  
Cliente/Solicitante

Imperatriz, 15 de dezembro de 2023.
