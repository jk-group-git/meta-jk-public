do_install_append (){
    rm -f ${D}/etc/systemd/system/getty.target.wants/getty@tty1.service
}
