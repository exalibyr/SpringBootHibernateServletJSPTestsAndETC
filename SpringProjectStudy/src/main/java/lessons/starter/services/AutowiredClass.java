package lessons.starter.services;

import lessons.starter.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;

import java.util.Map;

public class AutowiredClass {

//    //JSR 250
//    @Resource //По умолчанию поиск бина с именем "context"
//    private ApplicationContext context;
//
//    @Resource(name="greetingService") //Поиск бина с именем "greetingService"
//    public void setGreetingService(GreetingsService service) {
//        this.greetingsService = service;
//    }

    //--------------------------------------------------------------
    @Autowired(required = false) //к полям класса
    //чтобы не бросалось исключение,
    //если не с кем связать
    //рекомендуется использовать @Required
    @Qualifier("main")
    private GreetingsService greetingsService;

    @Autowired //к полям класса в виде массива или коллекции
    private GreetingsService[] greetingsServices;

    @Autowired //к Map, где ключами являются имена бинов, значения - сами бины
    private Map<String, GreetingsService> greetingsServiceMap;

    @Autowired //к конструктору
    public AutowiredClass(@Qualifier("main") GreetingsService greetingsService){}

    @Autowired //к обычным методам с произвольным названием аргументов и их количеством
    public void prepare(GreetingsService greetingsService){
        //...
    }

    @Autowired //к "традиционному" setter-методу
    public void setContext(GreetingsService greetingsService){
        this.greetingsService = greetingsService;
    }

}
