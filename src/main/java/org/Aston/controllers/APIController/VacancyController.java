package org.Aston.controllers.APIController;

import org.Aston.Entity.Vacancy;
import org.Aston.services.VacancyFinder;
import org.Aston.services.VacancyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/vacancies")
public class VacancyController {
    private final VacancyFinder vacancyService; //этому бину мой рест контроллер будет делигировать свои запросы  - --- vacancyService должен возвращать List<Vacancy>
    /*@Autowired*/
    public VacancyController(/*VacancyFinder vacancyService*/) {
        //TODO пока подключен тестово через new
        //TODO нужно чтобы vacancyService был бином и тут его заинжектить через @Autowired
        this.vacancyService = new VacancyService();
    }

    //Get метод для получения 5 вакансий по должности
    @RequestMapping ("/finder")
    public ResponseEntity<List<Vacancy>> read (
            @RequestParam(value = "jobTitle", required = true, defaultValue = "Java junior")
            String jobTitle)
    {
        List<Vacancy> vacancies = vacancyService.get5ByVacancyName(jobTitle);
        return new ResponseEntity<>(vacancies, HttpStatus.OK);
    }



    //TODO POST метод для внесения новой вакансии в базу  ---- если буде время поизучать
    @PostMapping(value = "/add")
    public ResponseEntity<?> create(@RequestBody Vacancy vacancy) {
        //TODO что то делает
        //......
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
