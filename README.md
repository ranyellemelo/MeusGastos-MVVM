Meus Gastos — MVVM

Aplicativo Android desenvolvido em Kotlin e Jetpack Compose para gerenciamento de despesas pessoais.

Objetivo

Permitir que o usuário registre, visualize, filtre e remova seus gastos de maneira simples e organizada.

Funcionalidades

* Cadastro de despesas com descrição, valor e categoria.
* Categorias: Alimentação, Transporte, Moradia, Lazer e Outros.
* Listagem de gastos cadastrados.
* Filtro de despesas por categoria.
* Cálculo automático do total de despesas.
* Contagem de gastos cadastrados.
* Exclusão de despesas.
* Validação dos dados informados.

Tecnologias utilizadas

* Kotlin
* Android Studio
* Jetpack Compose
* ViewModel
* Arquitetura MVVM

Arquitetura

O aplicativo utiliza a arquitetura MVVM (Model-View-ViewModel), separando os dados, as regras de apresentação e a interface do usuário.

* Model: representa os gastos e gerencia o acesso aos dados.
* ViewModel: controla o estado, valida os dados e executa as ações.
* View: apresenta as informações e recebe as interações do usuário.

Armazenamento

Nesta versão, os gastos são armazenados temporariamente em memória e podem ser perdidos quando o processo do aplicativo é encerrado.

Status

Projeto preparado para testes no Android Studio. Funcionamento ainda não validado em dispositivo ou emulador.

Disciplina

Programação Mobile — UNASP

Publicação

Projeto acadêmico desenvolvido para aplicação dos conceitos de ViewModel e arquitetura MVVM.
