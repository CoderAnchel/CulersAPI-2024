package com.example.fcbarcelonaapi_rest;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    public static List<Player> getAllPlayers() {
        List<Player> list = new ArrayList<>();
        list.add(new Player("Marc-André ter Stegen", "🇩🇪 Germany",
                "https://www.fcbarcelona.com/photo-resources/2022/07/01/7788f3eb-6769-4e8c-9270-745b379ad9bf/ter_stegen.png?width=670&height=790",
                "85kg", "187cm", "30/04/1992", "", 328, 0, 0, 122, 768,0));

        list.add(new Player("Iñaki Peña", "🇪🇸 Spain",
                "https://www.fcbarcelona.com/photo-resources/2022/08/02/fb7d77ce-a2ca-4b0b-a78f-4b9dcfc63f51/inaki_pena.png?width=670&height=790",
                "78kg", "184cm", "02/03/1999", "", 0, 0, 0, 0, 0,0));

        list.add(new Player("Sergiño Dest", "🇺🇸 Usa",
                "https://www.fcbarcelona.com/photo-resources/2022/07/01/4f633d67-3ba0-4207-a62d-2828d3c6c311/dest.png?width=670&height=790",
                "62kg", "175cm", "03/11/2000", "", 72, 3, 4, 0, 0,0));

        list.add(new Player("Gerard Piqué", "🇪🇸 Spain",
                "https://www.fcbarcelona.com/photo-resources/2022/07/01/74a12d82-ffbb-443f-812a-14344ef974d5/pique.png?width=670&height=790",
                "85kg", "194cm", "02/02/1987", "", 606, 52, 7, 0, 0,0));

        list.add(new Player("Ronald Araújo", "🇺🇾 Uruguay",
                "https://www.fcbarcelona.com/photo-resources/2022/07/01/5e7ec920-d018-41e8-b783-9990cd53fc78/araujo.png?width=670&height=790",
                "79kg", "188cm", "07/03/1999", "", 83, 6, 1, 0, 0,0));

        list.add(new Player("Jordi Alba", "🇪🇸 Spain",
                "https://www.fcbarcelona.com/photo-resources/2022/07/01/525076ed-ed92-4fdd-8736-4a4b92085fa8/jordi-alba.png?width=670&height=790",
                "68kg", "170cm", "21/03/1989", "", 429, 25, 85, 0, 0,0));
        return list;
    };
}
