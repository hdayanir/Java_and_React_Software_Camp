import React from 'react'
import { Button, Menu } from 'semantic-ui-react'

export default function SignedOut({signIn}) {
    return (
        <div>
            <Menu.Item>
            <Button onClick={signIn} primary>Giris yap</Button>
            <Button primary style={{marginLeft:'0.5em'}}>Kayıt ol</Button>
            </Menu.Item>
        </div>
    )
}
