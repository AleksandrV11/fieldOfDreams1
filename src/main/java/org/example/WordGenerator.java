package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

public class WordGenerator {

    static List<String> capital = List.of("Абу Дабі", "Абуджа", "Аваруа", "Адамстаун", "Аддис Абеба",  //столиці
            "Аккра", "Алжир", "Алофі", "Амман", "Амстердам", "Андорра ла Велья", "Анкара", "Антананаріву",
            "Апіа", "Асмера", "Астана", "Асунсьйон", "Атафу", "Афіни", "Ашгабат", "Багдад", "Баку", "Бамако", "Бангкок",
            "Бандар Сері Бегаван", "Банжул", "Бастер", "Бейрут", "Белград", "Бельмопан", "Берлін", "Берн", "Бішкек",
            "Богота", "Браззавіль", "Бразиліа", "Братислава", "Бриджтаун", "Брюссель", "Будапешт", "Буенос Айрес",
            "Бухарест", "Валлетта", "Варшава", "Ватикан", "Вашингтон", "Веллінгтон", "Вест Айленд", "Відень",
            "Вікторія", "Вільнюс", "Віндгук", "Габороне", "Гавана", "Гамільтон", "Гватемала", "Гельсінкі",
            "Гібралтар", "Гітега", "Гонконг", "Густавія", "Дакар", "Дакка", "Дамаск", "Джакарта", "Джибуті",
            "Джорджтаун", "Джуба", "Ділі", "Додома", "Доха", "Дублін", "Душанбе", "Кувейт", "Ер Ріяд", "Єреван", "Єрусалим",
            "Рамалла", "Загреб", "Ісламабад", "Кабул", "Каїр", "Кампала", "Канберра", "Каракас", "Кастрі",
            "Катманду", "Київ", "Кишинів", "Кігалі", "Кінгстон", "Кіншаса", "Кіто", "Конакрі", "Копенгаген",
            "Куала Лумпур", "Лібревіль", "Лілонгве", "Ліма", "Лісабон", "Лондон", "Луанда", "Лусака", "Любляна",
            "Люксембург", "Маджуро", "Мадрид", "Макао", "Малабо", "Мале", "Манагуа", "Манама", "Маніла", "Мапуту",
            "Мбабане", "Мехіко", "Мінськ", "Могадішо", "Монако", "Монровія", "Монтевідео", "Найробі", "Нгерулмуд",
            "Нджамена", "Ніамей", "Нікосія", "Нуакшот", "Нукуалофа", "Нумеа", "Нуук", "Нью Делі", "Осло", "Оттава", "Палікір",
            "Панама", "Парамарибо", "Париж", "Пекін", "Пномпень", "Подгориця", "Порт Морсбі", "Порт о Пренс", "Прага", "Пхеньян",
            "Рабат", "Рига", "Рим", "Розо", "Сантьяго", "Сан Хосе", "Сараєво", "Сеул", "Сінгапур", "Софія", "Стокгольм", "Сува",
            "Сукре", "Таллінн", "Ташкент", "Тбілісі", "Тегеран", "Тегусігальпа", "Тирана", "Токіо", "Триполі", "Туніс",
            "Тхімпху", "Уагадугу", "Улан Батор", "Фунафуті", "Ханой", "Хараре", "Хартум", "Яунде");


    static List<String> country = List.of("Об'єднані Арабські Емірати", "Нігерія", "ОстровиКука(Нова Зеландія)",    //країни
            "Острови Піткерн(Велика Британія)", "Ефіопія", "Гана", "Алжир", "Ніуе(Нова Зеландія)", "Йорданія",
            "Нідерланди", "Андорра", "Туреччина", "Мадагаскар", "Самоа", "Еритрея", "Казахстан", "Парагвай", "Токелау",
            "Греція", "Туркменістан", "Ірак", "Азербайджан", "Малі", "Таїланд", "Бруней", "Гамбія", "Сент-Кіттс і Невіс",
            "Ліван", "Сербія", "Беліз", "Німеччина", "Швейцарія", "Киргизстан", "Колумбія", "Республіка Конго",
            "Бразилія", "Словаччина", "Барбадос", "Бельгія", "Угорщина", "Аргентина", "Румунія", "Мальта", "Польща",
            "Ватикан", "Сполучені Штати Америки", "Нова Зеландія", "Кокосові Острови", "Австрія", "Сейшельські Острови",
            "Литва", "Намібія", "Ботсвана", "Куба", "Бермудські Острови", "Гватемала", "Фінляндія", "Гібралтар",
            "Бурунді", "Гонконг", "Сен-Бартельмі", "Сенегал", "Бангладеш", "Сирія", "Індонезія", "Джибуті", "Гаяна", "Південний Судан",
            "Східний Тімор", "Танзанія", "Катар", "Ірландія", "Таджикистан", "Кувейт", "Саудівська Аравія", "Вірменія",
            "Ізраїль", "Палестина", "Хорватія", "Пакистан", "Афганістан", "Єгипет", "Уганда", "Австралія", "Венесуела",
            "Сент-Люсія", "Непал", "Україна", "Молдова", "Руанда", "Ямайка", "Демократична Республіка Конго", "Еквадор",
            "Гвінея", "Данія", "Малайзія", "Габон", "Малаві", "Перу", "Португалія", "Велика Британія", "Ангола",
            "Замбія", "Словенія", "Люксембург", "Маршаллові Острови", "Іспанія", "Макао", "Екваторіальна Гвінея",
            "Мальдіви", "Нікарагуа", "Бахрейн", "Філіппіни", "Мозамбік", "Есватіні", "Мексика", "Білорусь", "Сомалі", "Монако",
            "Ліберія", "Уругвай", "Кенія", "Палау", "Чад", "Нігер", "Кіпр", "Мавританія", "Тонга", "Нова Каледонія",
            "Гренландія", "Індія", "Норвегія", "Канада", "Федеративні Штати Мікронезії", "Панама", "Суринам", "Франція",
            "Китай", "Камбоджа", "Чорногорія", "Папуа Нова Гвінея", "Гаїті", "Чехія", "Північна Корея", "Марокко", "Латвія",
            "Італія", "Домініка", "Чилі", "Коста-Рика", "Боснія і Герцеговина", "Південна Корея", "Сінгапур",
            "Болгарія", "Швеція", "Фіджі", "Болівія", "Естонія", "Узбекистан", "Грузія", "Іран", "Гондурас", "Албанія",
            "Японія", "Лівія", "Туніс", "Бутан", "Буркіна-Фасо", "Монголія", "Тувалу", "В’єтнам", "Зімбабве",
            "Судан", "Камерун");


    public static WordDTO generate() {
        int indRandom = (int) (Math.random() * capital.size());
        String generatedWord = capital.get(indRandom).toLowerCase();
        String generatedDescription = country.get(indRandom);
        return new WordDTO(generatedWord, generatedDescription);
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class WordDTO {
        private String word;
        private String description;
    }

}































