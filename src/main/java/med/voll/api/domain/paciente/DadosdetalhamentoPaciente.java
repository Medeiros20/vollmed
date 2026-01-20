package med.voll.api.domain.paciente;

import med.voll.api.domain.endereco.Endereco;

public record DadosdetalhamentoPaciente(String nome,
                                        String email,
                                        String telefone,
                                        String cpf,
                                        Endereco endereco) {
    public DadosdetalhamentoPaciente(Paciente paciente){
        this(paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getCpf(), paciente.getEndereco());
    }
}
