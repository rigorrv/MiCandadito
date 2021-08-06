package com.example.micandadito.model

fun mockData(): List<DirectionJson> {
    return listOf(
        DirectionJson(
            "rigo_rv",
            "Rigoberto Romero Valdez",
            "https://firebasestorage.googleapis.com/v0/b/micandadito.appspot.com/o/rigo.png?alt=media&token=d77182a7-457b-4477-9cbd-6147c493af79",
            "4608 W Maryland Ave apt 136",
            "Glendale", "Arizona", "USA", "3604411977", "10/11,2021",
            "rigo.rrv@gmail.com",
            listOf(
                ImagenesJson("https://micandadito.com/imagehouses/image1.jpg"),
                ImagenesJson("https://micandadito.com/imagehouses/image2.jpg"),
                ImagenesJson("https://micandadito.com/imagehouses/image3.jpg"),
                ImagenesJson("https://micandadito.com/imagehouses/image4.jpg"),
                ImagenesJson("https://micandadito.com/imagehouses/image5.jpg"),
                ImagenesJson("https://micandadito.com/imagehouses/image6.jpg"),
            ),
            listOf(
                Detalles(
                    "Compra", 0.00000, 0.00000, 0,
                    0, 0, "false", "false", "false",
                    "true,", "true",
                    "IMSSS", "La pitic", "Regis", "VMarc"
                )
            ),
            6000, 8000,
            false,
        ),
        DirectionJson(
            "lynetha_26",
            "Lynett Soto Villalobos",
            "https://firebasestorage.googleapis.com/v0/b/micandadito.appspot.com/o/lyneth.png?alt=media&token=b4813571-af6e-4989-92f8-a8420edb6e51",
            "Ave 5 Col Prados del sol #168",
            "Hermosillo", "Sonora", "Mexico", "6622153756", "10/11,2021",
            "lynetha26@gmail.com",
            listOf(
                ImagenesJson("https://media-cdn.tripadvisor.com/media/photo-s/17/63/09/b0/residencial-casa-linda.jpg"),
                ImagenesJson("https://www.visitalbir.com/wp-content/uploads/2019/09/casa-salamanda.jpg"),
                ImagenesJson("https://img.archiexpo.com/images_ae/projects/images-g/la-casa-provides-permanent-housing-homeless-washington-dc-5305-8786599.jpg"),
                ImagenesJson("https://cf.bstatic.com/xdata/images/hotel/max1024x768/160030022.jpg?k=14ce309cfe75d418bf7c748708b782fff60271c98be9cabdffc38be8d4b78eb0&o=&hp=1"),
                ImagenesJson("https://www.casadecampo.com.do/wp-content/uploads/2019/05/Esplendor_Exclusive_Villa.jpgg"),
                ImagenesJson("https://www.kbhome.com/images/Community%20Images/Florida/Orlando%20Area/Casa%20Bella/KBORD_Casa_Bella_Sign_9702-11x_1200x800.jpg?preset=big"),
            ),
            listOf(
                Detalles(
                    "Compra", 0.00000, 0.00000, 3,
                    1, 0, "Boiler, A/C, Internet", "true", "true",
                    "false,", "false",
                    "San Martin", "false", "false", "VMarc"
                )
            ),
            8000, 12000,
            false,
        ),
        DirectionJson(
            "fun_cp",
            "Daniel Copel",
            "https://firebasestorage.googleapis.com/v0/b/micandadito.appspot.com/o/daniel2.png?alt=media&token=9c6791a3-ac69-41ce-aec9-db0d6fbbe560",
            "9608 W Rancho Santa fe apt 136",
            "Goodyear", "Arizona", "USA", "9645896496", "10/11,2021",
            "daniel.coppel@gmail.com",
            listOf(
                ImagenesJson("https://images.adsttc.com/media/images/5df9/70a3/3312/fdf3/0800/0127/newsletter/_fi.jpg?1576628369"),
                ImagenesJson("https://i.blogs.es/c68014/casa-3d/450_1000.jpeg"),
                ImagenesJson("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSHJRZcdYfKmlaOWz8E_2FH1Ey6CpoYlSj5ug&usqp=CAU"),
                ImagenesJson("https://www.terratino.com/img/v2/sample-top1.jpg"),
                ImagenesJson("https://casadelmar.com/wp-content/uploads/2019/07/Casa-Del-Mar-2.jpg"),
                ImagenesJson("https://www.azuremagazine.com/wp-content/uploads/2020/06/Azure_Casa-Estudio_Manuel-Cervantes-1600x900.jpg"),
            ),
            listOf(
                Detalles(
                    "Compra", 0.00000, 0.00000, 3,
                    2, 2, "Boiler, A/C, Internet", "true", "true",
                    "true,", "true",
                    "IMSSS", "La pitic", "Regis", "VMarc"
                )
            ),
            4000, 6000,
            false,
        ),
        DirectionJson(
            "manuel_vs",
            "Manuel Villalobos",
            "https://firebasestorage.googleapis.com/v0/b/micandadito.appspot.com/o/manuel.png?alt=media&token=f598c505-9b7b-44bd-8829-7da53bf87722",
            "9608 W Rancho Santa fe apt 136",
            "Goodyear", "Arizona", "USA", "9645896496", "10/11,2021",
            "manuel.vs@gmail.com",
            listOf(
                ImagenesJson("https://images.adsttc.com/media/images/5da8/4dc0/3312/fd27/1100/01ca/medium_jpg/PATRICIO_ENDARA_ARQUITECTOS_-_CASAS_PILLAGUA_BARRANCO_-_FOTOGRAF%C3%8DA_7.jpg?1571311022"),
                ImagenesJson("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQsrPRKIpyA4IwtWCIH7SDSArP5jey6JBIa-A&usqp=CAU"),
                ImagenesJson("https://archello.s3.eu-central-1.amazonaws.com/images/2019/05/29/Casa-Picasso-por-Workshop-dise--o-y-Construccion-Merida-Yucatan-01.1559155677.7889.jpg"),
                ImagenesJson("https://img.archiexpo.com/images_ae/projects/images-g/la-casa-provides-permanent-housing-homeless-washington-dc-5305-8786601.jpg"),
                ImagenesJson("https://casacook.com/media/1342/casa-cook-hotels-rhodes.jpg?anchor=center&mode=crop&width=767&height=767&rnd=132682415720000000"),
                ImagenesJson("https://www.kbhome.com/images/Community%20Images/Nevada/Las%20Vegas/Casa%20Bella/Photography/KBLV_CasaBella_Plan1768-Exterior_8276c-1200.jpg?preset=big"),
            ),
            listOf(
                Detalles(
                    "Compra", 0.00000, 0.00000, 2,
                    1, 1, "A/C", "true", "false",
                    "true,", "true",
                    "false", "false", "false", "false"
                )
            ),
            4000, 9000,
            false,
        )
    )
}