LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "file://Avance1.py \
	  "

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
