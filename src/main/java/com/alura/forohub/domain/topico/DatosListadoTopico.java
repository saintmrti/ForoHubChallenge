package com.alura.forohub.domain.topico;

import java.time.LocalDateTime;

public record DatosListadoTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime f_registro,
        Integer status,
        String autor,
        String curso
) {
    public DatosListadoTopico(Topico topico) {
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getF_registro(),
                topico.getStatus(),
                topico.getAutor(),
                topico.getCurso().toString()
        );
    }
}
