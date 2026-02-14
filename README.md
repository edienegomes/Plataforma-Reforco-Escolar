# 📚 Plataforma de Apoio ao Reforço Escolar
Este projeto consiste no desenvolvimento de uma API REST para uma plataforma de apoio ao reforço escolar, com foco no aprimoramento do uso do framework Spring Boot e na prática da linguagem Java.
---
### 🚧 Nota: Este projeto está em desenvolvimento. Novas funcionalidades de segurança, banco de dados, melhorias e ajustes serão implementados conforme avanço nos meus conhecimentos.
---
## 🛠️ Tecnologias Utilizadas
- ***Java 21***
- ***Maven***
- ***Spring Boot***
### 📦 Dependências Principais
- ***Spring Data JPA*** - Faz a integração com o banco (define tabelas e mapeia as entidades)
- ***Spring Web*** - Utilizado para a construção de API REST
- ***Lombok*** - Biblioteca que reduz código boilerplate
- ***H2 Database*** - Banco de dados em memória para testes
- ***Validation*** - Validação de dados de entrada
- ***Spring Security*** - Responsável pela implementação de autenticação e autorização, controle de acesso
- ***Spring Boot DevTools*** - Ferramenta de apoio que permite reinicialização automática da aplicação
- ***SpringDoc OpenAPI (Swagger)*** - Geração automática da documentação interativa
---
## Funcionalidades principais
- ***Gestão de usuários:*** Cadastro, exclusão, listagem, busca e atualização.
- ***Sessão de Reforço:*** Criaçaõ, listagem por aluno e disciplina.
- ***Relatório Geral:*** Quantidade de sessões por aluno, solicitações por professor, <br> média de desempenho, ranking das disciplinas atendidas.
---
## Requisitos
- Ter o Java 21 (JDK) instalado em sua máquina.
- Ter o Maven instalado (ou usar o wrapper incluso no projeto).
---
## Passo a Passo
  1. Clone o repositório: <br>
     ````bash
     git clone [https://github.com/edienegomes/Plataforma-Reforco-Escolar.git]  
  2. Acesse a pasta do projeto:
     ```bash
     cd Plataforma-Reforco-Escolar
  3. A aplicação inicia na porta padrão 8080 (Documentação Swagger):
     ```bash
     http://localhost:8080/swagger-ui.html
  4. Banco de dados H2:
     ```bash
     http://localhost:8080/h2-console
