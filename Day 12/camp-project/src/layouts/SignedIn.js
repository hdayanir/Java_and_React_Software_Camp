import React from 'react'
import { Dropdown, Menu, Image } from 'semantic-ui-react'

export default function SignedIn({signOut}) {   
    return (
        <div>
            <Menu.Item>
                <Image avatar spaced="right" src ="https://huseyindayanir.me/images/myAvatar.png"/>
                <Dropdown pointing="top left" text="Huseyin">
                <Dropdown.Menu>
                        <Dropdown.Item text="Bilgilerim" icon="info"/>
                        <Dropdown.Item onClick={signOut} text="Çıkış Yap" icon="sign-out"/>
                    </Dropdown.Menu>
                </Dropdown>
            </Menu.Item>
        </div>
    )
}
