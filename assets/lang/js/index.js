var tnum = 'en';
 /*session*//*
*/
window.onload=function(){
 if (sessionStorage.getItem('user') != null) {
  var userJsonStr = sessionStorage.getItem('user');
  userEntity = JSON.parse(userJsonStr);
  tnum =userEntity.slang; 
  $('.current_lang .lang-txt').text(userEntity.sslang);
  $('.current_lang img').attr('src', userEntity.simg);
  translate(tnum);
  if (tnum != 'en') {
   var idss="."+tnum;
   $(idss).addClass('selected').siblings().removeClass('selected');
   $('.more_lang').removeClass('active');
  }
  if(tnum == 'ar'){
      $('body').attr('dir', 'rtl');	 
    }else{
      $('body').attr('dir', 'ltr');	 
    }
 }
};

	  /*session*/

	

$(document).ready(function(){
 /*session*/ 
  $(document).click( function(e) {
       $('.translate_wrapper, .more_lang').removeClass('active');     
  });
  
  $('.translate_wrapper .current_lang').click(function(e){    
    e.stopPropagation();
    $(this).parent().toggleClass('active'); 
    setTimeout(function(){
      $('.more_lang').toggleClass('active');
    }, 5);
  });
  

  /*TRANSLATE*/
  translate(tnum);
  /*点击后结束UL并改变CLASS类*/
  $('.more_lang .lang').click(function(){
    $(this).addClass('selected').siblings().removeClass('selected');
    $('.more_lang').removeClass('active');  
    
    var img = $(this).find('img').attr('src'); 
    var lang = $(this).attr('data-value');
	var langtranss = $(this).find('span').attr('data-value');
	  	  /*session*/
	var userEntity = {
    simg:img,
    slang:lang,
	sslang:langtranss
};
    sessionStorage.setItem('user', JSON.stringify(userEntity));
	  /*session*/
    var tnum = lang;
    translate(tnum);
    
    $('.current_lang .lang-txt').text(langtranss);
    $('.current_lang img').attr('src', img);
    
    if(lang == 'ar'){
      $('body').attr('dir', 'rtl');
    }else{
      $('body').attr('dir', 'ltr');
    }
    
  });
});

function translate(tnum){
	$('a#transhome').text(transtitle[0][tnum]);
	$('a#transabout').text(transtitle[1][tnum]);
	$('a#transservice').text(transtitle[2][tnum]);
	$('a#transcontact').text(transtitle[3][tnum]);
	$('h5#trindextext1').text(trindextitle[0][tnum]);
	$('p#trindextext2').text(trindextitle[1][tnum]);
	$('p#trindextext3').text(trindextitle[2][tnum]);
	$('p#trindextext4').text(trindextitle[3][tnum]);
	$('.transcontact01').text(transcontact[0][tnum]);
	$('.Contactus1').text(transcontact[1][tnum]);
	$('.Contactus2').text(transcontact[2][tnum]);
	$('.transrdm').text(trans[0][tnum]);
    $('h4#trantext1').text(trans[1][tnum]);
    $('p#trantext2').text(trans[2][tnum]);
    $('h4#trantext3').text(trans[3][tnum]);
    $('p#trantext4').text(trans[4][tnum]);
    $('h4#trantext5').text(trans[5][tnum]);
    $('p#trantext6').text(trans[6][tnum]);
}
var transtitle= [ 
	{ en : 'Home',
    pt : 'Página inicial',
    es : 'Página',
    fr : 'Page d \'accueil',
    de : 'Home Page',
	ru : 'Первая страница',
    cn : '首页',
    ar : ' فرونت بيج '
		 },{ en : 'About',
    pt : 'Sobre',
    es : 'Sobre',
    fr : 'Sur',
    de : 'Über',
	ru : 'о нас',
    cn : '关于',
    ar : 'عبير '
		 },{ en : 'Services',
    pt : 'Serviços',
    es : 'Servicios',
    fr : 'Services',
    de : 'Dienstleistungen',
    cn : '服务',
	ru : 'Services',
    ar : 'سرویس'
		 },{ en : 'Contact',
    pt : 'Contacto',
    es : 'Contacto',
    fr : 'Contact',
	ru : 'контакт',
    de : 'Kontakt',
    cn : '联系我们',
    ar : 'تلامس'
		 },
];
var trindextitle= [ 
	{ en : 'Belt Road Education Platform',
    pt : 'Plataforma de Educação Rodoviária do Cinturão',
    es : 'Plataforma de educación a lo largo del camino',
    fr : 'Belt Road Education Platform',
    de : 'Belt Road Education Platform',
	ru : 'учебно - просветительная платформа',
    cn : 'B&R教育平台',
    ar : 'منصة التعليم على طول الطريق'
		 },{ en : 'Belt & Road Education Platform is an International Educational Team. We help people from all over the world in their desire to come to China and The United States to study or travel. ',
    pt : 'Belt &Road Education Platform é UMA equipe Internacional de educação.Ajudamos pessoas de todo o Mundo EM SEU Desejo de vir para a China e OS Estados Unidos para estudar ou viajar.',
    es : 'La plataforma educativa "todo el camino" es un equipo educativo internacional.Ayudamos a personas de todo el mundo a venir a China y a los Estados Unidos para estudiar o viajar.',
    fr : 'La plate - forme éducative « tous ensemble » est une équipe éducative internationale.Nous aidons les gens du monde entier à étudier ou à voyager en Chine et aux États - Unis.',
    de : 'Belt & Road Education Platform ist ein internationales Bildungsteam.Wir helfen Menschen aus der ganzen Welt in ihrem Wunsch nach China und den Vereinigten Staaten, zu studieren oder zu reisen.',
	ru : 'учебная платформа "во всем районе" является международной образовательной группой.Мы помогаем людям со всего мира приезжать в китай и сша учиться или путешествовать.',
    cn : 'B&R教育平台是一支国际化的教育团队。我们帮助来自世界各地的人们来中国和美国学习或旅游。',
    ar : 'منصة التعليم على طول الطريق هو فريق التعليم الدولينحن نساعد الناس من جميع أنحاء العالم يأتون إلى الصين والولايات المتحدة للدراسة أو السفر'
		 },{ en : 'As useful information for you on our page you will find information about scholarships that are available in China and your way to be enrolled to American college. Our company stands out from others because we are working with colleges in person and getting the best options for you, sometimes it is cheaper to book on our website than on the school page directly! Don\'t miss it up, and follow on our fresh news.',
    pt : 'Como informação útil para você EM nossa página você VAI encontrar informações sobre bolsas de estudo que estão disponíveis Na China e SUA maneira de ser matriculado para a Faculdade americana.Nossa empresa destaca-se DOS outros porque estamos trabalhando com faculdades EM Pessoa e recebendo as melhores opções para você, às vezes é Mais Barato reservar EM Nosso site do que Na página Da escola diretamente!Não perca, e sIgA nossas novas notícias.',
    es : 'Como información útil, puede encontrar en nuestra página web información sobre las becas que ofrece China y la forma en que ingresa en las universidades de los Estados Unidos.¡Nuestra empresa se destaca porque estamos trabajando cara a cara con la Universidad para ofrecer las mejores opciones, a veces las reservas en nuestro sitio web son más baratas que las reservas directas en la página de la escuela!No lo pierdas de vista, sigue con nuestras nuevas noticias.',
    fr : 'Vous trouverez sur notre site Internet des informations sur les bourses offertes par la Chine et sur la manière dont vous entrez dans l \'université américaine.Notre société est originale, parce que nous sommes en face de l \'université, vous offrir le meilleur choix, quelquefois sur notre site Web de réserver directement sur la page de l\' école moins cher!Ne ratez pas ça.',
    de : 'Als nützliche Informationen für Sie auf unserer Seite finden Sie Informationen über Stipendien, die in China verfügbar sind und Ihre Art, an der amerikanischen Hochschule eingeschrieben zu werden.Unser Unternehmen zeichnet sich von anderen aus, weil wir mit Colleges persönlich arbeiten und die besten Optionen für Sie erhalten, manchmal ist es billiger, auf unserer Website als auf der Schulseite direkt zu buchen!Verpassen Sie es nicht und folgen Sie unseren Neuigkeiten.',
    cn : '作为对您有用的信息，您可以在我们的网页上找到有关中国提供的奖学金以及您进入美国大学的方式的信息。我们公司脱颖而出，因为我们是与大学当面合作，为您提供最佳选择，有时在我们的网站上预订比直接在学校页面上预订便宜！别错过了，继续关注我们的新消息。',
	ru : 'в качестве полезной информации вы можете найти на нашей странице информацию о стипендиях, предоставляемых Китаем, и о том, как вы поступили в американский университет.наша компания вне себя, потому что мы сотрудничаем с университетом, чтобы предоставить вам лучший выбор, иногда на нашем сайте бронирование дешевле, чем прямо на школьной странице!не промахнитесь, продолжайте следить за нашими новыми новостями.',
    ar : 'للحصول على معلومات مفيدة لك ، يمكنك العثور على معلومات عن المنح الدراسية التي تقدمها الصين على موقعنا على الانترنت ، فضلا عن الطريقة التي يمكنك الوصول إلى الجامعة الأمريكيةشركتنا تبرز لأننا نتعاون مع الجامعة وجها لوجه ، وتوفير أفضل خيار لكم ، في بعض الأحيان الحجز على موقعنا على الانترنت أرخص من الحجز مباشرة على صفحة المدرسة!لا تفوت ، إبقاء العين على الأخبار الجديدة'
		 },{ en : 'We are doing service for you because we know from our own experience how challenging and in case cases complicated it is to find the right institution and the most reasonable price.\nOur passion is to help you reach your peak in your starting phrase of development of your career. ',
    pt : 'Estamos a prestar-lhe serviço, porque sabemos por experiência própria Como é desafiador e, EM casos complicados, encontrar a instituição certa e o preço Mais razoável.\nNossa paixão é ajudá-lo a alcançar SEU Pico EM SUA frase inicial de Desenvolvimento de SUA carreira.',
    es : 'Estamos a su servicio porque sabemos por experiencia propia cuán difícil y complejo es encontrar las instituciones adecuadas y los precios más razonables.\nNuestra pasión es ayudarle a llegar a la cima en la etapa inicial de su carrera.',
    fr : 'Nous sommes à votre service parce que nous savons d \'expérience combien il est difficile et complexe de trouver les institutions appropriées et les prix les plus raisonnables.\nNotre enthousiasme est de vous aider à atteindre le Sommet au début de votre carrière.',
	ru : 'Мы служим вам потому, что из нашего собственного опыта мы знаем, насколько трудно и сложно найти подходящую организацию и оптимальную цену.\nнаш энтузиазм помогает вам достичь пика на начальной стадии развития карьеры.',
    de : 'Wir arbeiten für Sie, weil wir aus eigener Erfahrung wissen, wie herausfordernd und in Fällen kompliziert es ist, die richtige Institution und den angemessensten Preis zu finden.\nUnsere Leidenschaft ist es, Ihnen dabei zu helfen, Ihren Höhepunkt in Ihrem Ausgangspunkt der Entwicklung Ihrer Karriere zu erreichen.',
    cn : '我们为您服务是因为我们从自己的经验中知道，找到合适的机构和最合理的价格是多么的困难和复杂。\n我们的热情是帮助您在职业发展的起始阶段达到顶峰。',
    ar : 'نحن نخدمك لأننا نعرف من تجربتنا الخاصة ، مدى صعوبة وتعقيد العثور على المؤسسات المناسبة وبأسعار معقولة/nحماسنا هو لمساعدتك على الوصول إلى القمة في بداية حياتك المهنية'
		 },
];
var transcontact= [ 
	{ en :'Gangjiang Road, 1142, building 23, 5114-43 \n Yangpu District, Shanghai',
    pt : 'Gangjiang Road, 1142, edifício 23, 5114-43\n Distrito de Yangpu, Xangai ',
    es : 'Gangjiang Road, 1142, edifício 23, 5114-43\n Distrito de Yangpu, Xangai ',
    fr : '1142 Gang Jiang Lu, Yangpu District \n ville de Shanghai 23dong 5114 - 43',
    de : 'Gangjiang Road, 1142, Gebäude 23, 5114-43\n Yangpu District, Shanghai',
	ru : 'Gangjiang Road, 1142, строение 23, 5114-43\n Район Янпу, Шанхай \nСент - хайтсвилль, Паттерсон, штат Мэриленд, Соединенные Штаты, 2003 год, стр. 20782 ',
    cn : '上海市杨浦区港江路1142弄23号5114-43室 ',
    ar : '5114-43 ، 23 بناء ، 1142 ، Gangjiang الطريق ، منطقة يانغبو شنغهاي'
		 },{ en : 'Contact US',
    pt : 'Contacte OS EUA',
    es : 'Llámanos',
    fr : 'Contactez - nous',
    de : 'Kontakt USA',
    cn : '联系我们',
	ru : 'контакт',
    ar : 'اتصل بنا'
		 },{ en :'Gangjiang Road, 1142, building 23, 5114-43 \n Yangpu District, Shanghai \n 2003  Patterson St \n Hyattsville, MD,US 20782',
    pt : 'Gangjiang Road, 1142, edifício 23, 5114-43\n Distrito de Yangpu, Xangai\n 2003 St. hattsville, Paterson, MD 20782, EUA',
    es : 'Gangjiang Road, 1142, edifício 23, 5114-43\n Distrito de Yangpu, Xangai\n Patterson St. Heitsville, Maryland (Estados Unidos de América), 2003, post: 20782',
    fr : '1142 Gang Jiang Lu, Yangpu District \n ville de Shanghai 23dong 5114 - 43\n États - Unis d \'Amérique Paterson St. Hayzville 2003, Maryland',
    de : 'Gangjiang Road, 1142, Gebäude 23, 5114-43\n Yangpu District, Shanghai \n 2003 St. hattsville, Paterson, MD 20782, USA',
	ru : 'Gangjiang Road, 1142, строение 23, 5114-43\n Район Янпу, Шанхай \n Сент - хайтсвилль, Паттерсон, штат Мэриленд, Соединенные Штаты, 2003 год, стр. 20782 ',
    cn : '上海市杨浦区港江路1142弄23号5114-43室\n 美国马里兰州帕特森圣海茨维尔2003号，邮编：20782',
    ar : ' الولايات المتحدة الامريكية \n5114-43 ، 23 بناء ، 1142 ، Gangjiang الطريق ، منطقة يانغبو شنغهاي'
		 },
];
var trans = [ 
	{ 
    en : 'Read More',
    pt : 'Saiba mais',
    es : 'Más información',
    fr : 'En savoir plus',
    de : 'Weitere Infos',
    cn : '查看更多',
	ru : 'читать больше',
    ar : 'مشاهدة المزيد'
  },
  { 
    en : 'Learn Courses Online',
    pt : 'Aprender OS Cursos Online',
    es : 'Cursos en línea',
    fr : 'Cours en ligne',
    de : 'Lernen Sie Kurse online', 
    cn : '在线学习课程',
	ru : 'учебный курс',
    ar : 'دورة التعلم عبر الإنترنت'
  },{ 
    en : 'Fast and convenient online courses, you can enjoy knowledge anytime, anywhere.',
    pt : 'Cursos online rápidos e convenientes, você Pode desfrutar de conhecimento a qualquer momento, EM qualquer Lugar.',
    es : 'Cursos en línea rápidos y fáciles de aprender, donde y cuando quiera.',
    fr: "Un cours en ligne rapide, pratique et accessible à tout moment.",
    de: 'Schnelle und bequeme Online-Kurse, Sie können Wissen jederzeit und überall genießen.',
	ru : 'быстрый и удобный онлайн - курс, всегда и везде наслаждаться знаниями.',
    cn: '快捷方便的在线课程，可随时随地静享知识.',
    ar : ' مريحة وسريعة على الانترنت بالطبع ، في أي وقت وفي أي مكان للاستمتاع المعرفة '
  },{ 
    en : 'Highly Qualified Teachers',
    pt : 'Professores altamente qualificados',
    es : 'Profesores calificados',
    fr : 'Enseignant de qualité',
    de : 'Hochqualifizierte Lehrer',
	ru : 'высококвалифицированный учитель',
    cn : '高素质教师',
    ar : 'جودة عالية من المعلمين'
  },{ 
    en : 'With many teachers and rich teaching experience',
    pt : 'Com muitos professores e experiência pedagógica Rica',
    es : 'Muchos maestros y mucha experiencia docente.',
    fr : 'Avoir beaucoup d\'enseignants, avoir une grande expérience de l\' enseignement',
    de : 'Mit vielen Lehrern und reichhaltiger Lehrerfahrung',
	ru : 'иметь большое количество учителей и богатый опыт преподавания',
    cn : '拥有众多教师，有着丰富的教学经验',
    ar : ' مع العديد من المعلمين ، لدينا تجربة غنية في التدريس'
  },{ 
    en : 'Book Library & Stores',
    pt : 'Biblioteca do Livro',
    es : 'Biblioteca y Librería',
    fr : 'Bibliothèque et librairie',
    de : 'Buchbibliothek & Speicher',
	ru : 'библиотека и магазин',
    cn : '图书馆和书店',
    ar : 'المكتبات والمكتبات'
  },{ 
    en : 'Rich teaching books satisfy all kinds of students\' learning',
    pt : 'Livros de ensino Rico satisfazem todos OS tipos de aprendizagem DOS estudantes',
    es : 'Libros de enseñanza ricos para estudiantes de todo tipo',
    fr : 'L \'abondance des livres d\' enseignement satisfait toutes les catégories d \'élèves',
    de : 'Reiche Lehrbücher erfüllen alle Arten von Lernenden',
	ru : 'богатый набор учебных материалов удовлетворяет образовательные потребности различных категорий учащихся',
    cn : '丰富的教学书籍满足各类学生的学习',
    ar : 'وفرة من الكتب التعليمية لتلبية جميع أنواع التعلم من الطلاب '
  },
  
];