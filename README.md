# Voll.med API REST🏥

<p align="center">
<img width="461" height="95" alt="image" src="https://github.com/user-attachments/assets/aa70ea6f-5792-4860-a34d-5d365efc6d2f" />
</p>

A Voll.med é uma API REST desenvolvida para a gestão de uma clínica médica, permitindo o gerenciamento de médicos, pacientes e o agendamento de consultas. O projeto foca em boas práticas de desenvolvimento, segurança com JWT e organização de banco de dados com migrações.

## 🛠️ Tecnologias Utilizadas
- Java 17
- Spring Boot 3
- Spring Data JPA (Persistência de dados)
- Spring Security (Autenticação e Autorização)
- Auth0 JWT (Token de segurança)
- MySQL (Banco de dados relacional)
- Flyway (Gerenciamento de migrações de banco de dados)
- Lombok (Produtividade e redução de código boilerplate)
- Maven (Gerenciador de dependências)
- insomnia

## 📋 Funcionalidades
### 🔐 Autenticação
- Login: Aberto ao público. Retorna um Token JWT para acessar as rotas protegidas.

### 🩺 Médicos & 👤 Pacientes
- Cadastro: Requer autorização.
- Listagem: Listagem paginada e ordenada.
- Atualização: Edição de dados específicos (ex: telefone, endereço).
- Exclusão: Exclusão lógica (desativação) do registro no banco de dados.

### 📅 Consultas
- Agendamento: Permite marcar consultas validando a disponibilidade do médico e horário de funcionamento da clínica.
- Cancelamento: Permite cancelar consultas com justificativa.

## 🚀 Como Executar o Projeto
### Clone o repositório:
  ```
  git clone https://github.com/Dev-Joao-Medeiros/vollmed.git
  ```
### Configure o Banco de Dados:
- Certifique-se de ter o MySQL instalado.
- Crie um database chamado `vollmed_api`.
- No arquivo `src/main/resources/application.properties`, ajuste as credenciais:
```
  spring.datasource.url=jdbc:mysql://localhost:3306/vollmed_api
  spring.datasource.username=${seu_usuario}
  spring.datasource.password=${sua_senha}
  api.security.token.secret=${JWT_SECRET:12345678}
```
## Endpoints Principais
| Método | Endpoint | Descrição | Requer Token? |
| :--- | :--- | :--- | :--- |
| `POST` | `/login` | Autenticação e geração de token | **Não** |
| `POST` | `/medicos` | Cadastro de novo médico | **Sim** |
| `GET` | `/medicos` | Listagem de médicos ativos (paginada) | **Sim** |
| `PUT` | `/medicos` | Atualização de dados do médico | **Sim** |
| `DELETE` | `/medicos/{id}` | Exclusão lógica de médico | **Sim** |
| `POST` | `/pacientes` | Cadastro de novo paciente | **Sim** |
| `POST` | `/consultas` | Agendamento de consulta | **Sim** |
| `DELETE` | `/consultas` | Cancelamento de consulta | **Sim** |
