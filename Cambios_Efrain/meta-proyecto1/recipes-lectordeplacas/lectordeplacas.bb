DESCRIPTION = "Simple Python setuptools hello world application"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

FILESEXTRAPATHS_prepend := "${THISDIR}:"
SRC_URI = "file://lectordeplacas-1.0.tar.gz"

inherit pkgconfig
DEPENDS = "opencv"
RDEPENDS_${PN} = "libopencv-core libopencv-imgproc libopencv-highgui libopencv-videoio libopencv-imgcodecs"

S = "${WORKDIR}"

inherit setuptools3

do_install_append () {
    install -d ${D}${bindir}
    install -m 0755 Avance1.py ${D}${bindir}
}
