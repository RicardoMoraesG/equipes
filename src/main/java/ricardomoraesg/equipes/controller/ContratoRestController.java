package ricardomoraesg.equipes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ricardomoraesg.equipes.model.Contrato;
import ricardomoraesg.equipes.model.Entidade;
import ricardomoraesg.equipes.model.Integrante;
import ricardomoraesg.equipes.service.ContratoService;

@RestController
@RequestMapping("/contrato")
public class ContratoRestController {

    @Autowired
    private ContratoService contratoService;
    @GetMapping
    public ResponseEntity<Iterable<Contrato>> buscarTodos(){
        return ResponseEntity.ok(contratoService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contrato> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(contratoService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Contrato> inserir(Contrato contrato) {
        return ResponseEntity.ok(contratoService.inserir(contrato));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Contrato> atualizar(@PathVariable Long id, @RequestBody Contrato contrato){
        contratoService.atualizar(id, contrato);
        return ResponseEntity.ok(contrato);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Contrato> deletar(@PathVariable Long id){
        contratoService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
