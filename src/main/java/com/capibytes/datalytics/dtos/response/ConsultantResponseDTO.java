package com.capibytes.datalytics.dtos.response;

import com.capibytes.datalytics.domain.entities.Contact;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class ConsultantResponseDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String cpf;
    private String email;
    private Set<Integer> profiles = new HashSet<>();
    private List<Contact> contacts = new ArrayList<>();
    private String especializacao;
    private String sobre;
    private Set<String> links = new HashSet<>();
}
