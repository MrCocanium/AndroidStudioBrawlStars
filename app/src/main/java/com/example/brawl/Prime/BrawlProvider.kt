package com.example.brawl.Prime

class BrawlProvider {
    companion object {
        val listaBrawlers = listOf(
            // Brawlers Comunes
            Brawler(
                nombre = "Shelly",
                rareza = "Brawler Inicial",
                clase = "Destructor",
                foto = "https://th.bing.com/th/id/OIP.uuV6cu4qf6sA4Fgr0JWmoQHaGj?w=178&h=180&c=7&r=0&o=5&pid=1.7",
                descripcion = "Shelly es una luchadora versátil con una escopeta de gran alcance."
            ),
            Brawler(
                nombre = "Nita",
                rareza = "Especial",
                clase = "Destructor",
                foto = "https://th.bing.com/th/id/OIP.G8uUY29MGdL2yBO5XN9LhgHaF4?w=226&h=180&c=7&r=0&o=5&pid=1.7",
                descripcion = "Nita puede invocar a un gran oso que la ayuda en la batalla."
            ),
            Brawler(
                nombre = "Colt",
                rareza = "Especial",
                clase = "Destructor",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/0/08/Colt_Portrait.png/revision/latest?cb=20210115110713",
                descripcion = "Colt dispara una ráfaga de balas con gran precisión a larga distancia."
            ),
            Brawler(
                nombre = "Bull",
                rareza = "Especial",
                clase = "Tanque",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/4/4a/Bull_Portrait.png/revision/latest?cb=20200304182325",
                descripcion = "Bull es un tanque que se especializa en combate cercano con su escopeta."
            ),
            Brawler(
                nombre = "Jessie",
                rareza = "SuperEspecial",
                clase = "Control",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/4/4e/Jessie_Portrait.png/revision/latest?cb=20211122033625",
                descripcion = "Jessie dispara proyectiles rebotantes y puede colocar una torreta automática."
            ),
            Brawler(
                nombre = "Brock",
                rareza = "Especial",
                clase = "Tiro de Elite",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/f/f9/Brock_Portrait.png/revision/latest?cb=20240830201725",
                descripcion = "Brock dispara cohetes a larga distancia con alto daño en área."
            ),
            Brawler(
                nombre = "Dynamike",
                rareza = "SuperEspecial",
                clase = "Artilleria",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/6/64/Dynamike_Portrait.png/revision/latest?cb=20200304182305",
                descripcion = "Dynamike lanza cartuchos de dinamita que explotan tras un corto tiempo."
            ),
            Brawler(
                nombre = "Bo",
                rareza = "Epico",
                clase = "Control",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/3/30/Bo_Portrait.png/revision/latest?cb=20191013135616",
                descripcion = "Bo dispara flechas explosivas y coloca trampas de minas."
            ),
            Brawler(
                nombre = "Tick",
                rareza = "SuperEspecial",
                clase = "Artilleria",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/7/72/Tick_Portrait.png/revision/latest?cb=20190629012550",
                descripcion = "Tick lanza minas explosivas y su súper lanza su cabeza explosiva."
            ),
            Brawler(
                nombre = "8-Bit",
                rareza = "SuperEspecial",
                clase = "Destructor",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/0/0b/8-Bit_Portrait.png/revision/latest?cb=20191012200012",
                descripcion = "8-Bit dispara ráfagas de rayos láser y coloca una torreta potenciadora de daño."
            ),
            Brawler(
                nombre = "Emz",
                rareza = "Epico",
                clase = "Control",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/a/a4/Emz_Portrait.png/revision/latest?cb=20200304182125",
                descripcion = "Emz usa su spray para infligir daño en área y ralentizar enemigos."
            ),
            // Brawlers Raros
            Brawler(
                nombre = "El Primo",
                rareza = "Especial",
                clase = "Tanque",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/c/c5/El_Primo_Portrait.png/revision/latest?cb=20191012200018",
                descripcion = "El Primo es un luchador con gran salud y daño cuerpo a cuerpo."
            ),
            Brawler(
                nombre = "Barley",
                rareza = "Especial",
                clase = "Artilleria",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/a/a1/Barley_Portrait.png/revision/latest/scale-to-width-down/120?cb=20200304182055",
                descripcion = "Barley lanza botellas incendiarias a larga distancia."
            ),
            Brawler(
                nombre = "Poco",
                rareza = "Especial",
                clase = "Apoyo",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/5/59/Poco_Portrait.png/revision/latest/scale-to-width-down/120?cb=20210115111016",
                descripcion = "Poco cura a los aliados con su guitarra."
            ),
            Brawler(
                nombre = "Rosa",
                rareza = "Especial",
                clase = "Tanque",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/9/94/Rosa_Portrait.png/revision/latest/scale-to-width-down/120?cb=20200303144700",
                descripcion = "Rosa se especializa en defensa y puede usar un escudo para reducir el daño."
            ),
            // Brawlers Súper Raros
            Brawler(
                nombre = "Rico",
                rareza = "SúperEspecial",
                clase = "Destructor",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/e/e1/Rico_Portrait.png/revision/latest/scale-to-width-down/120?cb=20200304182045",
                descripcion = "Rico dispara balas que rebotan entre los enemigos."
            ),
            Brawler(
                nombre = "Darryl",
                rareza = "SúperEspecial",
                clase = "Tanque",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/4/46/Darryl_Portrait.png/revision/latest/scale-to-width-down/120?cb=20200317100419",
                descripcion = "Darryl rueda hacia los enemigos y dispara desde su barril."
            ),
            Brawler(
                nombre = "Penny",
                rareza = "SúperEspecial",
                clase = "Control",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/8/8d/Penny_Portrait.png/revision/latest/scale-to-width-down/120?cb=20220629081359",
                descripcion = "Penny lanza monedas explosivas y coloca una torreta que dispara cañonazos."
            ),
            Brawler(
                nombre = "Carl",
                rareza = "SúperEspecial",
                clase = "Destructor",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/1/19/Carl_Portrait.png/revision/latest/scale-to-width-down/120?cb=20200304182115",
                descripcion = "Carl lanza su pico y puede usarlo para atacar a distancia."
            ),
            Brawler(
                nombre = "Jacky",
                rareza = "SúperEspecial",
                clase = "Tanque",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/0/03/Jacky_Portrait.png/revision/latest/scale-to-width-down/120?cb=20200317100434",
                descripcion = "Jacky usa su aspiradora para atraer a los enemigos y luego los lanza al aire."
            ),
            // Brawlers Épicos
            Brawler(
                nombre = "Stu",
                rareza = "Épico",
                clase = "Asesino",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/c/c8/Stu_Portrait.png/revision/latest/scale-to-width-down/120?cb=20210309220216",
                descripcion = "Stu desliza por el mapa y lanza cohetes."
            ),
            Brawler(
                nombre = "Piper",
                rareza = "Épico",
                clase = "Tiro de Elite",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/f/f0/Piper_Portrait.png/revision/latest/scale-to-width-down/120?cb=20200304182144",
                descripcion = "Piper dispara balas de largo alcance con alto daño."
            ),
            Brawler(
                nombre = "Pam",
                rareza = "Épico",
                clase = "Apoyo",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/d/dc/Pam_Portrait.png/revision/latest/scale-to-width-down/120?cb=20200513143851",
                descripcion = "Pam cura a los aliados con su área de efecto."
            ),
            Brawler(
                nombre = "Frank",
                rareza = "Épico",
                clase = "Tanque",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/6/63/Frank_Portrait.png/revision/latest/scale-to-width-down/120?cb=20200304182409",
                descripcion = "Frank aturde a los enemigos con su martillo."
            ),
            Brawler(
                nombre = "Bibi",
                rareza = "Épico",
                clase = "Tanque",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/c/c2/Bibi_Portrait.png/revision/latest/scale-to-width-down/120?cb=20200303144656",
                descripcion = "Bibi lanza una pelota que rebota entre los enemigos."
            ),
            Brawler(
                nombre = "Bea",
                rareza = "Épico",
                clase = "Tiro de Elite",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/a/ae/Bea_Portrait.png/revision/latest/scale-to-width-down/120?cb=20200317100451",
                descripcion = "Bea dispara abejas que se agrupan y causan daño."
            ),
            // Brawlers Legendarios
            Brawler(
                nombre = "Spike",
                rareza = "Legendario",
                clase = "Destructor",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/2/22/Spike_Portrait.png/revision/latest/scale-to-width-down/120?cb=20200304182450",
                descripcion = "Spike lanza cactus explosivos que infligen daño en área."
            ),
            Brawler(
                nombre = "Crow",
                rareza = "Legendario",
                clase = "Asesino",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/6/6f/Crow_Portrait.png/revision/latest/scale-to-width-down/120?cb=20200706075842",
                descripcion = "Crow lanza veneno que debilita a los enemigos."
            ),
            Brawler(
                nombre = "Leon",
                rareza = "Legendario",
                clase = "Asesino",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/4/48/Leon_Portrait.png/revision/latest/scale-to-width-down/120?cb=20200304182803",
                descripcion = "Leon se vuelve invisible para sorprender a los enemigos."
            ),
            Brawler(
                nombre = "Meg",
                rareza = "Legendario",
                clase = "Tanque",
                foto = "https://static.wikia.nocookie.net/brawlstars/images/5/58/Meg_Portrait.png/revision/latest/scale-to-width-down/120?cb=20210925184245",
                descripcion = "Meg tiene un cambio de forma que la convierte en un robot gigante."
            ),
            // Brawlers Brawlers adicionales para futuro
        )
    }
}
