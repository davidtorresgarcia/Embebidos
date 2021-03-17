LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

FILESEXTRAPATHS_prepend := "${THISDIR}:"
SRC_URI = "file://lectordeplacas-1.0.tar.gz"

inherit setuptools3

S = "${WORKDIR}"

TARGET_CC_ARCH += "${LDFLAGS}"

do_configure() {
	:
}

do_compile() {
	${CC} Avance1.py -o Avance1
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 Avance1 ${D}${bindir}
}
